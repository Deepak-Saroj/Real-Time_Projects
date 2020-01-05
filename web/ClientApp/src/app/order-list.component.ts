import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'order-list',
    templateUrl: 'order-list.component.html'
})

export class OrderListComponent{
    order = [];

    constructor(private hc:HttpClient){
        this.hc.get("http://localhost:8090/Order/getAllRecord").subscribe((data)=>{
            this.order = <any[]>data;
        })
    }
}