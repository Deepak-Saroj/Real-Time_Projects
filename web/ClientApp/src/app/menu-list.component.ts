import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'menu-list',
    templateUrl: 'menu-list.component.html'
})

export class MenuListComponent{
    menu = [];

    constructor(private hc:HttpClient){
        this.hc.get("http://localhost:8090/Menu/getAllRecord").subscribe((data)=>{
            this.menu = <any[]>data;
        })
    }
}