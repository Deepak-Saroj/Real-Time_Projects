import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'restaurant-list',
    templateUrl: 'restaurant-list.component.html'
})

export class RestaurantListComponent{
    restaurant = [];

    constructor(private hc:HttpClient){
        this.hc.get("http://localhost:8090/Restaurants/getAllRecord").subscribe((data)=>{
            this.restaurant = <any[]>data;
        })
    }
}