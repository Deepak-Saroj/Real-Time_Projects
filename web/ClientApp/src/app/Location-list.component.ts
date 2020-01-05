import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'location-list',
    templateUrl: 'location-list.component.html'
})

export class LocationListComponent{
    Location = [];

    constructor(private hc:HttpClient){
        this.hc.get("http://localhost:8090/Locations/getAllLocation").subscribe((data)=>{
            this.Location = <any[]>data;
        })
    }
}