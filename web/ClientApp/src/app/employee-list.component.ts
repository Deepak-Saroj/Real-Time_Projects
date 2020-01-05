import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'employee-list',
    templateUrl: 'employee-list.component.html'
})

export class EmployeeListComponent{
    employee = [];

    constructor(private hc:HttpClient){
        this.hc.get("http://localhost:8090/Employee/getAllRecord").subscribe((data)=>{
            this.employee = <any[]>data;
        })
    }
}