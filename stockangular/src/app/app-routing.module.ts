import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddproductComponent } from './addproduct/addproduct.component';
import { SearchnameComponent } from './searchname/searchname.component';
import { SearchcategoryComponent } from './searchcategory/searchcategory.component';


const routes: Routes = [
  {path: 'addproduct', component: AddproductComponent},
  {path: 'searchname', component: SearchnameComponent},
  {path: 'searchcate', component: SearchcategoryComponent},
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
