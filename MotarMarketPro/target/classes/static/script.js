// Helper: API base URL (adjust if backend runs on a different port)
const API_BASE = 'http://localhost:8080/api/vehicle';

// VEHICLE CRUD
async function fetchVehicles() {
    const res = await fetch(`${API_BASE}/allvehicle`);
    const vehicles = await res.json();
    renderVehicleTable(vehicles);
}

function renderVehicleTable(vehicles) {
    const tbody = document.querySelector('#vehicle-table tbody');
    tbody.innerHTML = '';
    vehicles.forEach(vehicle => {
        const tr = document.createElement('tr');
        tr.innerHTML = `
            <td>${vehicle.vehicle_id ?? ''}</td>
            <td>${vehicle.vehicle_type ?? ''}</td>
            <td>${vehicle.manufacturer ?? ''}</td>
            <td>${vehicle.model ?? ''}</td>
            <td>${vehicle.fuel_type ?? ''}</td>
            <td>${vehicle.ownership ?? ''}</td>
            <td>${vehicle.reg_data ?? ''}</td>
            <td>${vehicle.veh_number ?? ''}</td>
            <td>${vehicle.price ?? ''}</td>
            <td>
                <button onclick="editVehicle(${vehicle.vehicle_id}, '${vehicle.vehicle_type}', '${vehicle.manufacturer}', '${vehicle.model}', '${vehicle.fuel_type}', '${vehicle.ownership}', '${vehicle.reg_data}', '${vehicle.veh_number}', '${vehicle.price}')">Edit</button>
                <button onclick="deleteVehicle(${vehicle.vehicle_id})">Delete</button>
            </td>
        `;
        tbody.appendChild(tr);
    });
}

async function addOrUpdateVehicle(e) {
    e.preventDefault();
    const id = document.getElementById('vehicle-id').value;
    const vehicle_type = document.getElementById('vehicle-type').value;
    const manufacturer = document.getElementById('vehicle-manufacturer').value;
    const model = document.getElementById('vehicle-model').value;
    const fuel_type = document.getElementById('vehicle-fuel-type').value;
    const ownership = document.getElementById('vehicle-ownership').value;
    const reg_data = document.getElementById('vehicle-reg-data').value;
    const veh_number = document.getElementById('vehicle-number').value;
    const price = document.getElementById('vehicle-price').value;
    const vehicle = { vehicle_type, manufacturer, model, fuel_type, ownership, reg_data, veh_number, price };
    if (id) {
        // Update
        await fetch(`${API_BASE}/update/${id}`, {
            method: 'PUT',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(vehicle)
        });
    } else {
        // Add
        await fetch(`${API_BASE}/addvehicle`, {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(vehicle)
        });
    }
    document.getElementById('vehicle-form').reset();
    fetchVehicles();
}

function editVehicle(id, vehicle_type, manufacturer, model, fuel_type, ownership, reg_data, veh_number, price) {
    document.getElementById('vehicle-id').value = id;
    document.getElementById('vehicle-type').value = vehicle_type;
    document.getElementById('vehicle-manufacturer').value = manufacturer;
    document.getElementById('vehicle-model').value = model;
    document.getElementById('vehicle-fuel-type').value = fuel_type;
    document.getElementById('vehicle-ownership').value = ownership;
    document.getElementById('vehicle-reg-data').value = reg_data;
    document.getElementById('vehicle-number').value = veh_number;
    document.getElementById('vehicle-price').value = price;
}

async function deleteVehicle(id) {
    await fetch(`${API_BASE}/delete/${id}`, { method: 'DELETE' });
    fetchVehicles();
}

// SOLD VEHICLE CRUD
async function fetchSoldVehicles() {
    const res = await fetch(`${API_BASE}/allsoldvehicle`);
    const soldVehicles = await res.json();
    renderSoldVehicleTable(soldVehicles);
}

function renderSoldVehicleTable(soldVehicles) {
    const tbody = document.querySelector('#sold-vehicle-table tbody');
    tbody.innerHTML = '';
    soldVehicles.forEach(vehicle => {
        const tr = document.createElement('tr');
        tr.innerHTML = `
            <td>${vehicle.sold_id ?? ''}</td>
            <td>${vehicle.vehicle_id ?? ''}</td>
            <td>${vehicle.vehicle_type ?? ''}</td>
            <td>${vehicle.manufacturer ?? ''}</td>
            <td>${vehicle.model ?? ''}</td>
            <td>${vehicle.fuel_type ?? ''}</td>
            <td>${vehicle.ownership ?? ''}</td>
            <td>${vehicle.reg_data ?? ''}</td>
            <td>${vehicle.veh_number ?? ''}</td>
            <td>${vehicle.price ?? ''}</td>
            <td>${vehicle.sold_date ?? ''}</td>
            <td>${vehicle.buyer_name ?? ''}</td>
            <td>${vehicle.buyer_contact ?? ''}</td>
        `;
        tbody.appendChild(tr);
    });
}

async function addSoldVehicle(e) {
    e.preventDefault();
    const sold_id = document.getElementById('sold-id').value;
    const vehicle_id = document.getElementById('sold-vehicle-id').value;
    const vehicle_type = document.getElementById('sold-vehicle-type').value;
    const manufacturer = document.getElementById('sold-vehicle-manufacturer').value;
    const model = document.getElementById('sold-vehicle-model').value;
    const fuel_type = document.getElementById('sold-vehicle-fuel-type').value;
    const ownership = document.getElementById('sold-vehicle-ownership').value;
    const reg_data = document.getElementById('sold-vehicle-reg-data').value;
    const veh_number = document.getElementById('sold-vehicle-number').value;
    const price = document.getElementById('sold-vehicle-price').value;
    const sold_date = document.getElementById('sold-date').value;
    const buyer_name = document.getElementById('buyer-name').value;
    const buyer_contact = document.getElementById('buyer-contact').value;
    const soldVehicle = { sold_id, vehicle_id, vehicle_type, manufacturer, model, fuel_type, ownership, reg_data, veh_number, price, sold_date, buyer_name, buyer_contact };
    await fetch(`${API_BASE}/addSoldvehicle`, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(soldVehicle)
    });
    document.getElementById('sold-vehicle-form').reset();
    fetchSoldVehicles();
}

// Event Listeners
window.onload = () => {
    fetchVehicles();
    fetchSoldVehicles();
    document.getElementById('vehicle-form').addEventListener('submit', addOrUpdateVehicle);
    document.getElementById('sold-vehicle-form').addEventListener('submit', addSoldVehicle);
};