import { NgModule } from '@angular/core';
import { BrowserModule } from "@angular/platform-browser";
import { AppComponent } from './app.component';
import { FormsModule } from "@angular/forms";
import { HttpClientModule } from '@angular/common/http';
import { StateListComponent } from './state-list.component';
import { StateInsertComponent } from './state-insert.component';
import { CityListComponent } from './city-list.component';
import {CityInsertComponent}from './city-insert.component';
import{DesignationListComponent}from './designation-list.component';
import{DesignationInsertComponent}from './designation-insert.component';
import{LocationListComponent}from './location-list.component';
import{LocationInsertComponent}from './location-insert.component';
import{DiningListComponent}from './dinings-list.component';
import{DiningInsertComponent}from './dinings-insert.component';
import{RestaurantInsertComponent}from './restaurant-insert.component';
import{RestaurantListComponent}from './restaurant-list.component';

import{EmployeeListComponent}from './employee-list.component';
import{EmployeeInsertComponent}from './employee-insert.component';
import{MenuListComponent}from './menu-list.component';
import{MenuInsertComponent}from './menu-insert.component';
import{OrderListComponent}from './order-list.component';
import{OrderInsertComponent}from './order-insert.component';
import{ShiftListComponent}from './shift-list.component';
import{ShiftInsertComponent}from './shift-insert.component';

import{PermissionListComponent}from './permission-list.component';
import{PermissionInsertComponent}from './permission-insert.component';
import{RoleListComponent}from './role-list.component';
import{RoleInsertComponent}from './role-insert.component';
import{UserListComponent}from './user-list.component';
import{UserInsertComponent}from './user-insert.component';



@NgModule({
    imports: [BrowserModule,HttpClientModule,FormsModule],
    declarations: [AppComponent,StateListComponent,StateInsertComponent,CityInsertComponent,CityListComponent,DesignationListComponent,DesignationInsertComponent,
        LocationInsertComponent,LocationListComponent,DiningInsertComponent,DiningListComponent,
        RestaurantListComponent,RestaurantInsertComponent,EmployeeInsertComponent,EmployeeListComponent,
        MenuInsertComponent,MenuListComponent,OrderInsertComponent,OrderListComponent,ShiftInsertComponent,
        ShiftListComponent,PermissionInsertComponent,PermissionListComponent,RoleInsertComponent,RoleListComponent,
        UserListComponent,UserInsertComponent
    ],
    bootstrap: [AppComponent]
})
export class AppModule { }
