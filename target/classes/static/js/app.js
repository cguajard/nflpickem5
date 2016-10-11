/**
    * Created by cguajardo on 9/15/16 at 8:02 PM
    */
var app = angular.module('app', ['ngRoute','ngResource']);
app.config(function($routeProvider){
    $routeProvider
        .when('/users',{
            templateUrl: '/views/users.html',
            controller: 'usersController'
        })
        .when('/roles',{
            templateUrl: '/views/roles.html',
            controller: 'rolesController'
        })
        .when('/tbd' , {
            templateUrl: '/views/schedule.html',
            controller: 'scheduleController',
            controllerAs: 'controller'
        })
        .otherwise(
        { redirectTo: '/'}
    );
});
