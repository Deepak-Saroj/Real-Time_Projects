import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'designation-list',
    templateUrl: 'designation-list.component.html'
})

export class DesignationListComponent{
    designation = [];

    constructor(private hc:HttpClient){
        this.hc.get("http://localhost:8090/Designations/getAllRecord").subscribe((data)=>{
            this.designation = <any[]>data;
        })
    }
}