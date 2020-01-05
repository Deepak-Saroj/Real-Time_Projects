import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'shift-list',
    templateUrl: 'shift-list.component.html'
})

export class ShiftListComponent{
    shift = [];

    constructor(private hc:HttpClient){
        this.hc.get("http://localhost:8090/Shift/getAllRecord").subscribe((data)=>{
            this.shift = <any[]>data;
        })
    }
}