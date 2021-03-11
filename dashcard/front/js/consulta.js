function validaLogin() {
    let usuario = localStorage.getItem("userLogged")

    if (!usuario) {
        window.location = "index.html"
    }

    let objUser = JSON.parse(usuario)

    document.getElementById("dadosUser").innerHTML = 'Usuário: <b>' + objUser.nome;
    consultaAgente()
}

function consultaAgente() {

    const url = "http://localhost:8080/agfinanceiro/top10/"

    fetch(url)
        .then(res => validaResposta(res))
}

function logout() {
    localStorage.removeItem("userLogged");
    window.location = "index.html"
}

function validaResposta(resultado) {
    if (resultado.status == 200) {
        resultado.json().then(res => exibirParceiros(res))
    } else {
        document.getElementById("saida").innerHTML = "Não encontrado"
    }
}

function exibirParceiros(dados) {
    let dropdown = ' <select class="form-control" onchange="exibirDash()">';
    for (let index = 0; index < dados.length; index++) {
        // tabela += '<tr> <td>' + dados[index].descricao + '</td><td>' + dados[index].valor + '</td><td>' + dados[index].data  + '</td> </tr>'
        dropdown += `<option value="${dados[index].id}">${dados[index].nome}</option>`
    }
    dropdown +="</select>"
    document.getElementById("opcoes").innerHTML = dropdown
}

function exibirDados(dados) {
    let tabela = '<table> <tr> <th>Parceiro</th> <th>Volume Transacional</th></tr>'

    for (let index = 0; index < dados.length; index++) {
        // tabela += '<tr> <td>' + dados[index].descricao + '</td><td>' + dados[index].valor + '</td><td>' + dados[index].data  + '</td> </tr>'
        tabela += `<tr><td> ${dados[index].nome} </td><td> ${dados[index].volume_transacional}</tr>`
    }

    tabela += '</table>'

    document.getElementById("saida").innerHTML = tabela
}

