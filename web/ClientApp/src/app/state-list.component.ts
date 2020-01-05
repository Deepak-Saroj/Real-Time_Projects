import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'state-list',
    templateUrl: 'state-list.component.html'
})

export class StateListComponent{
    states = [];

    constructor(private hc:HttpClient){
        this.hc.get("http:localhost:8090/States/getAllState").subscribe((data)=>{
            this.states = <any[]>data;
        })
    }
}