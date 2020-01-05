import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'permission-list',
    templateUrl: 'permission-list.component.html'
})

export class PermissionListComponent{
    permission = [];

    constructor(private hc:HttpClient){
        this.hc.get("http://localhost:8090/permission/accessingData").subscribe((data)=>{
            this.permission = <any[]>data;
        })
    }
}