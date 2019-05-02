let zipCode = document.getElementById('zipCode');
let listLocality = document.getElementById('locality');
const myurl = "http://localhost:8082/Cities/findByZipCode/";



zipCode.onkeyup = () => {
    const toto = zipCode.value;
    if (toto.length == 5) {
        console.log('toto');
        client = new XMLHttpRequest();










        client.open('GET', myurl, true);
        
        client.send();
    

    
}



}