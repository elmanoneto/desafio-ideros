app.controller('EmailController', function ($scope, EmailService, $rootScope, $stateParams, $location) {

  $scope.emails = [];
  $scope.email;
  $rootScope.unread = 0;
  $rootScope.read = 0;
  $scope.reads = [];
  $scope.unreads = [];

  EmailService.getEmails().success(function(data) {
    $scope.emails = data;
    for (var i in $scope.emails) {
      if ($scope.emails[i].unread == true) {
        $rootScope.unread++;
        $scope.unreads.push($scope.emails[i]);
      } else {
        $rootScope.read++;
        $scope.reads.push($scope.emails[i]);
      }
    }
    $rootScope.entry = data.length;

    if ($stateParams.id) {
      $scope.email = data[$stateParams.id];
    }
  }).error(function (error) {
    console.log(error);
  })

  $scope.$on('$location', function(next, current) {
    console.log($location);
  });

})
