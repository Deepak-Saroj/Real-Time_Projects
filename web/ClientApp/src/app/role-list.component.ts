import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'role-list',
    templateUrl: 'role-list.component.html'
})

export class RoleListComponent{
    role = [];

    constructor(private hc:HttpClient){
        this.hc.get("http://localhost:8090/role/accessingData").subscribe((data)=>{
            this.role = <any[]>data;
        })
    }
}