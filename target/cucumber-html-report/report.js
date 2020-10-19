$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("authentificationParam/AuthentificationParam.feature");
formatter.feature({
  "line": 2,
  "name": "Authentification - Param - OrangeHRM",
  "description": "En tant que utilisateur je souhaite m authentifier",
  "id": "authentification---param---orangehrm",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.before({
  "duration": 7723279855,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "Je ouvre l application OrangeHRM",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Je saisie le nom de l utilisateur \"Admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Je saisie le mot de passe \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Je clique sur le bouton Login",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Redirection vers la page Home",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeOuvreLApplicationOrangeHRM()"
});
formatter.result({
  "duration": 4828110413,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 35
    }
  ],
  "location": "AuthentificationParamStepDefinition.jeSaisieLeNomDeLUtilisateur(String)"
});
formatter.result({
  "duration": 178756689,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 27
    }
  ],
  "location": "AuthentificationParamStepDefinition.jeSaisieLeMotDePasse(String)"
});
formatter.result({
  "duration": 190987380,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeCliqueSurLeBoutonLogin()"
});
formatter.result({
  "duration": 3679435100,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.redirectionVersLaPageHome()"
});
formatter.result({
  "duration": 56338838,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "clique - BUZZ",
  "description": "",
  "id": "authentification---param---orangehrm;clique---buzz",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@buzz"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "Je clique sur le module Buzz",
  "keyword": "When "
});
formatter.match({
  "location": "AuthentificationParamStepDefinition.jeCliqueSurLeModuleBuzz()"
});
formatter.result({
  "duration": 4858560784,
  "status": "passed"
});
formatter.after({
  "duration": 1714732959,
  "status": "passed"
});
formatter.before({
  "duration": 6414249566,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "Je ouvre l application OrangeHRM",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Je saisie le nom de l utilisateur \"Admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Je saisie le mot de passe \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Je clique sur le bouton Login",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Redirection vers la page Home",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeOuvreLApplicationOrangeHRM()"
});
formatter.result({
  "duration": 2409003908,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 35
    }
  ],
  "location": "AuthentificationParamStepDefinition.jeSaisieLeNomDeLUtilisateur(String)"
});
formatter.result({
  "duration": 129407815,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 27
    }
  ],
  "location": "AuthentificationParamStepDefinition.jeSaisieLeMotDePasse(String)"
});
formatter.result({
  "duration": 131842858,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeCliqueSurLeBoutonLogin()"
});
formatter.result({
  "duration": 2195219738,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.redirectionVersLaPageHome()"
});
formatter.result({
  "duration": 1086990556,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "clique - temps",
  "description": "",
  "id": "authentification---param---orangehrm;clique---temps",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@temps"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "Je clique sur le module Temp",
  "keyword": "When "
});
formatter.match({
  "location": "AuthentificationParamStepDefinition.jeCliqueSurLeModuleTemp()"
});
formatter.result({
  "duration": 2107769786,
  "status": "passed"
});
formatter.after({
  "duration": 1375926598,
  "status": "passed"
});
});