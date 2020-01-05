import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'dining-list',
    templateUrl: 'dinings-list.component.html'
})

export class DiningListComponent{
    dining = [];

    constructor(private hc:HttpClient){
        this.hc.get("http://localhost:8090/Dinings/getAllRecord").subscribe((data)=>{
            this.dining = <any[]>data;
        })
    }
}