const PRODUCTS_KEY = "orders";

getProductsFromLocalStorage = () =>{
    let orders=[];

    if(localStorage.getItem(PRODUCTS_KEY)){
        orders=JSON.parse(localStorage.getItem(PRODUCTS_KEY));
    }

    return orders;
}

addItemFormSubmit = () =>{
    let orders = getProductsFromLocalStorage();

    let itemNameTextBox = document.querySelector("#first_20");
    let itemLastNameTextBox = document.querySelector("#last_20");
    let itemAddress1TextBox = document.querySelector("#input_21_addr_line1");
    let itemAddress2TextBox = document.querySelector("#input_21_addr_line2");
    let itemPhone1TextBox = document.querySelector("#input_19_area");
    let itemPhone2TextBox = document.querySelector("#input_19_phone");
    let itemPriceTextBox = document.querySelector("#input_RS");
    let itemQuantityTextBox = document.querySelector("#Quantity_24");

    let order = {
        name:itemNameTextBox.value+itemLastNameTextBox.value,
        address1:itemAddress1TextBox.value,
        address2:itemAddress2TextBox.value,
        phone1:itemPhone1TextBox.value+itemPhone2TextBox,
        price:parseFloat(itemPriceTextBox.value),
        quantity:parseInt(itemQuantityTextBox.value)
    };

    orders.push(order);
    localStorage.setItem(PRODUCTS_KEY,JSON.stringify(orders));
}

loadItems = () =>{
    let products = getProductsFromLocalStorage();

    let tableBody = document.querySelector("#prdData");

    /*    products.forEach(product => {
            let prdRow = createProductRow(product);
            tableBody.append(prdRow);
        }); */

    for(let product of products){
        let prdRow = createProductRow(product);
        tableBody.append(prdRow);
    }
}

createProductRow = (product) =>{

    let nameCol = document.createElement("td");
    nameCol.textContent=product.name;

    let LastnameCol = document.createElement("td");
    LastnameCol.textContent=product.lastname;

    let addressCol1 = document.createElement("td");
    addressCol1.textContent=product.address1;

    let addressCol2 = document.createElement("td");
    addressCol2.textContent=product.address2;

    let PhoneCol = document.createElement("td");
    PhoneCol.textContent=product.phone1;

    let priceCol = document.createElement("td");
    priceCol.textContent=product.price;

    let quantityCol = document.createElement("td");
    quantityCol.textContent=product.quantity;



    // let qtyCol = document.createElement("td");
    // qtyCol.textContent=product.quantity;

    let prdRow = document.createElement("tr");
    prdRow.append(nameCol);
    prdRow.append(LastnameCol);
    prdRow.append(addressCol1);
    prdRow.append(addressCol2);
    prdRow.append(PhoneCol);
    prdRow.append(priceCol);
    prdRow.append(quantityCol);
    prdRow.append();

    return prdRow;
}

clear_all_data = () =>{
    localStorage.clear()
    location.reload()
}