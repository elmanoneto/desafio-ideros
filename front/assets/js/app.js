var app = angular.module('ideros', ['ui.router']);

app.config(function ($stateProvider, $urlRouterProvider) {
  $stateProvider
    .state('inbox', {
      url: "",
      templateUrl: "../views/inbox.html",
      controller : "EmailController",
    })
    .state('email', {
      url: "email/:id",
      templateUrl: "../views/email.html",
      controller : "EmailController",
    })
})
