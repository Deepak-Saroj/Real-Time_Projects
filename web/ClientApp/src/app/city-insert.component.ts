import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'city-insert',
    templateUrl: 'city-insert.component.html'
})

export class CityInsertComponent{
    city = {};
    states = [];
    locations = [];
    constructor(private hc:HttpClient){
        this.hc.get("http://localhost:8090/States/getAllState").subscribe((data)=>{
            this.states = <any[]>data;
        /*  this.hc.get("http://localhost:8090/Locations/getAllLocation").subscribe((data)=>{
            this.locations = <any[]>data;  */
        });
    }
}