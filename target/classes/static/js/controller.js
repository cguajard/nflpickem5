/**
    * Created by cguajardo on 9/15/16 at 8:01 PM
    */
app.controller('usersController', function($scope) {
    $scope.headingTitle = "User List";
});

app.controller('rolesController', function($scope) {
    $scope.headingTitle = "Roles List";
});

app.controller('scheduleController', ["$scope", "$http", function($scope, $http) {
    var self = this;
    $http.get('/schedule').success(function (response) {
        self.schedule = response;
        self.pickPoints = ['1', '2', '3', '4', '5'];
    })
}]);


app.controller("getjson", ["$scope", "$http", function($scope, $http) {
    $http.get('schedule').
        success(function(res) {
            $scope.data = res;
        });
}]);
