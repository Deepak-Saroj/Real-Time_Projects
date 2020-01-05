import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'user-list',
    templateUrl: 'user-list.component.html'
})

export class UserListComponent{
    user = [];

    constructor(private hc:HttpClient){
        this.hc.get("http://localhost:8090/users/accessingData").subscribe((data)=>{
            this.user = <any[]>data;
        })
    }
}