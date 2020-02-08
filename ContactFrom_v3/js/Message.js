const PRODUCTS_KEY = "Messages";

getProductsFromLocalStorage = () =>{
    let Messages=[];

    if(localStorage.getItem(PRODUCTS_KEY)){
        Messages=JSON.parse(localStorage.getItem(PRODUCTS_KEY));
    }

    return Messages;
}

addItemFormSubmit = () =>{
    let Messages = getProductsFromLocalStorage();

    let itemNameTextBox = document.querySelector("#CF_Name");
    let itemEmailTextBox = document.querySelector("#last_20");
    let itemSubjectTextBox = document.querySelector("#CF_Subject");
    let itemMessageTextBox = document.querySelector("#CF_Message");


    let Message = {
        name:itemNameTextBox.value,
        email:itemEmailTextBox.value,
        subject:itemSubjectTextBox.value,
        Message:itemMessageTextBox.value,

    };

    Messages.push(Message);
    localStorage.setItem(PRODUCTS_KEY,JSON.stringify(Messages));
};

loadItems = () =>{
    let Messages = getProductsFromLocalStorage();

    let tableBody = document.querySelector("#prdMgsData");

    /*    products.forEach(product => {
            let prdRow = createProductRow(product);
            tableBody.append(prdRow);
        }); */

    for(let product of Messages){
        let prdRow = createProductRow(product);
        tableBody.append(prdRow);
    }
};

createProductRow = (Message) =>{

    let nameCol = document.createElement("td");
    nameCol.textContent=Message.name;

    let emailCol = document.createElement("td");
    emailCol.textContent=Message.email;

    let subjectCol1 = document.createElement("td");
    subjectCol1.textContent=Message.subject;

    let messageCol = document.createElement("td");
    messageCol.textContent=Message.Message;


    let prdRow = document.createElement("tr");
    prdRow.append(nameCol);
    prdRow.append(emailCol);
    prdRow.append(subjectCol1);
    prdRow.append(messageCol);
    prdRow.append();

    return prdRow;
};

clear_all_data = () =>{
    localStorage.clear()
    location.reload()
};