let nome = document.forml.name;
let sobrenome = document.forml.lastName;
let checkbox = document.querySelectorAll('#check');
let radioGen = document.querySelectorAll('#gender')
let senhaA = document.forml.senha1;
let senhaB = document.forml.senha2;
let btnExibir = document.querySelector("#btn");
let btnEditar = document.querySelector("#btnEdit");
btnEditar.style.display = "none";


document.forml.addEventListener("submit", function getFormvalue(event) {
    event.preventDefault();

    if (nome.value == "") {
        alert("O campo nome é obrigatório");
    } else if (sobrenome.value == "") {
        alert("O campo sobrenome é obrigatório");
    }

    if (senhaA.value != senhaB.value) {
        alert("As senhas devem ser iguais");
    }
})

radioGen.forEach(function (genClick) {
    genClick.addEventListener("click", function () {
        if (genClick.value == "feminino") {
            document.body.style.background = "pink"
        } else if (genClick.value == "masculino") {
            document.body.style.background = "blue"
        } else {
            document.body.style.background = "green"
        }
    })
})

btnExibir.addEventListener("click", function () {
    document.querySelector("#forml").style.display = "none";

    btnEditar.style.display = "inline-block";

    let ul = document.createElement("ul");

    let liNome = document.createElement("li");
    liNome.innerHTML = nome.value;

    let liSobrenome = document.createElement("li");
    liSobrenome.innerHTML = sobrenome.value;

    let liCheckbox = document.createElement("li");
    checkbox.forEach(function (resposta) {
        liCheckbox.innerHTML = resposta.value
    })

    let liGender = document.createElement("li");
    radioGen.forEach(function (genero) {
        liGender.innerHTML = genero.value
    })

    let liSenha = document.createElement("li");
    liSenha.innerHTML = nome.value;

    document.body.appendChild(ul)
    ul.appendChild(liNome);
    ul.appendChild(liSobrenome);
    ul.appendChild(liCheckbox);
    ul.appendChild(liGender);
    ul.appendChild(liSenha);

    btnEditar.style.display = "block"
    btnEditar.addEventListener("click", function () {
        let promptRes = prompt("Deseja mudar seus dados? Sim ou não")

        if (promptRes === "sim") {
            liNome.innerHTML = prompt("Seu nome é " + nome.value + ", deseja mudar?")
            liSobrenome.innerHTML = prompt("Seu sobrenome é " + sobrenome.value + ", deseja mudar?")
        }
    })
})






