app.service('EmailService', function ($http) {
  return ({
    getEmails: function () {
      return $http({
        method: 'GET',
        url: 'http://localhost:8080/emails'
      })
    }
  })
})
