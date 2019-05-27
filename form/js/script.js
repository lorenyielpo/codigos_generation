let nome = document.forml.name;
let sobrenome = document.forml.lastName;
let checkbox = document.querySelectorAll('#check');
let radioGen = document.querySelectorAll('#gender')
let senhaA = document.forml.senha1;
let senhaB = document.forml.senha2;
let btnExibir = document.querySelector("#btn");
let btnEditar = document.querySelector("#btnEdit");
let btnReset = document.querySelector("#reset")
btnEditar.style.display = "none";

let arrayScript = new Array()

btnReset.addEventListener("click", function () {
    arrayScript.push("Resetei o meu form")
})

document.forml.addEventListener("submit", function (event) {
    event.preventDefault();

    if (nome.value == "") {
        alert("O campo nome é obrigatório");
    } else if (sobrenome.value == "") {
        alert("O campo sobrenome é obrigatório");
    }

    if (senhaA.value != senhaB.value) {
        alert("As senhas devem ser iguais");
    }

    arrayScript.push("Enviei meus dados")
})

radioGen.forEach(function (genClick) {
    genClick.addEventListener("click", function () {
        if (genClick.value == "feminino") {
            document.body.style.background = "blue"
        } else if (genClick.value == "masculino") {
            document.body.style.background = "pink"
        } else {
            document.body.style.background = "green"
        }
    })
})

btnExibir.addEventListener("click", function () {
    arrayScript.push("Eu exibi meus dados")
    document.querySelector("#forml").style.display = "none";

    btnEditar.style.display = "inline-block";

    let ul = document.createElement("ul");

    let liNome = document.createElement("li");
    liNome.innerHTML = "Nome: " + nome.value;

    let liSobrenome = document.createElement("li");
    liSobrenome.innerHTML = "Sobrenome: " + sobrenome.value;

    let liCheckbox = document.createElement("li");
    checkbox.forEach(function (resposta) {
        if(resposta.checked == true){
           liCheckbox.innerHTML = "Deseja receber notícias: " + resposta.value; 
        } 
    })

    let liGender = document.createElement("li");
    radioGen.forEach(function (genero) {
        if(genero.checked == true){
        liGender.innerHTML = "Genero: " + genero.value}
    })

    document.body.appendChild(ul)
    ul.appendChild(liNome);
    ul.appendChild(liSobrenome);
    ul.appendChild(liCheckbox);
    ul.appendChild(liGender);

    btnEditar.style.display = "block"
    btnEditar.addEventListener("click", function () {
        arrayScript.push("Eu quis mudar meus dados")
        let promptRes = prompt("Deseja mudar seus dados? Sim ou não")

        if (promptRes === "sim") {
            let li = document.querySelectorAll("li");
            li.forEach(function (dadoLi) {
                dadoLi.addEventListener("click", function () {
                    let alterarValor = prompt("Insira seu novo dado?")
                    dadoLi.innerHTML = "Valor: " + alterarValor
                    arrayScript.push("Alterei meu dado para" + alterarValor)
                })
            })
        }
    })
})

let inputArray = document.querySelectorAll("input")
inputArray.forEach(function (inputForm) {
    inputForm.addEventListener("change", function () {
        if (inputForm.value != "") {
            arrayScript.push("O dado " + inputForm.value + " foi inserido")
        }
    })
})

console.log(arrayScript)



