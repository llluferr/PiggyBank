# PiggyBank
Projeto de Digital Business Enablement.

## Endpoints
- Despesas
    - [Cadastrar](#cadastrar-despesa)
    - Listar todas
    - Apagar
    - Alterar
    - [Mostrar os detalhes](#detalhar-despesa)

-Contas
    - Cadastrar
    - Listar todas
    - Apagar
    - Alterar
    - Mostrar os detalhes

-Categorias

## Cadastrar Despesa 
`POST` /piggybank/api/despesa

| campo | tipo | obrigatorio | descricao 
|-----|:----:|-----------|---------
| valor | decimal | sim | eh o valor da despesa. deve ser maior que zero 
| categoria_id | int | sim | eh o id de uma categoria previamente cadastrada 
| data | data | sim | eh a data da despesa
| descricao | texto | nao | uma descricao da despesa com o no maximo 255 caracteres

**Exemplo de corpo do request**

```js
{
    "valor" : 100.00,
    "categoria_id" : 1,
    "conta_id" : 1,
    "data" : "2023-01-27"
    "descricao" : "cinema com os amigos" 
}
```

**Codigos de resposta**

| codigo | descricao
|-|-
| 201 | despesa cadastrada com sucesso
| 400 | erro na validacao dos dados da requisicao

---

###Detalhar Despesa
`GET` /piggybank/api/despesa/{id}

**Exemplo de corpo da resposta**

```js
{
    "valor" : 100.00,
    "categoria" : {
        "categoria_id" : 1,
        "nome" : "lazer"
    }
    "conta" : {
        "conta_id" : 1,
        "nome" : "itau"
    }
    "data" : "2023-01-27"
    "descricao" : "cinema com os amigos" 
}
```

**Codigos de resposta**