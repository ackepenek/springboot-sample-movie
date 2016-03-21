var movieModule = angular.module('movieApp', []);

movieModule.controller('movieController', function ($scope, $http) {
    var urlBase="";
    $scope.toggle=true;
    $scope.selection = [];

    $scope.saveMovie = function saveMovie(){
        $http.post(urlBase + '/save', {
            name: $scope.name,
            type: $scope.type
        }).
        success(function(data) {
            alert(data);
        });
    }
});
