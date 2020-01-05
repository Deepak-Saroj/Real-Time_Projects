import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'city-list',
    templateUrl: 'city-list.component.html'
})

export class CityListComponent{
    city = [];

    constructor(private hc:HttpClient){
        this.hc.get("http://localhost:8090/City/getAllcity").subscribe((data)=>{
            this.city = <any[]>data;
        })
    }
}
