import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { AppComponent } from './app.component';
import {HttpClientModule } from '@angular/common/http';
import {  HeaderComponent } from './Header/header.component';
import { HomeComponent } from './Home/home.component';
import { AboutComponent } from './about/about.component';
import { HelpComponent } from './help/help.component';


import { RouterModule } from '@angular/router';

import { Footer1Component } from './footer1/footer1.component';

import { PropertyBindingComponent } from './data-binding/property-binding/property-binding.component';
import { EventBindingComponent } from './data-binding/event-binding/event-binding.component';

import { StructuralDirectiveComponent } from './Directives/structural-directive/structural-directive.component';
import { NgForComponent } from './Directives/structural-directive/ng-for/ng-for.component';
import { NgswitchComponent } from './Directives/structural-directive/ngswitch/ngswitch.component';
import { CustomDirectve } from './custom.directive';
import { RegisterComponent } from './register/register.component';
import { FormsComponent } from './forms/forms.component';

import { ReactiveformComponent } from './reactiveform/reactiveform.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CommentsComponent } from './comments/comments.component';
import { CommentsDetailsComponent } from './comments-details/comments-details.component';
import { DollarPipe } from './dollar.pipe';

@NgModule({
  declarations: [
    // tslint:disable-next-line: max-line-length
    AppComponent,
    HeaderComponent,
     HomeComponent,
      AboutComponent ,
      HelpComponent ,
        Footer1Component,
         PropertyBindingComponent,
         EventBindingComponent,
         StructuralDirectiveComponent,
         NgForComponent,
         NgswitchComponent,
       CustomDirectve,
       RegisterComponent,
       FormsComponent,
       ReactiveformComponent,
       ParentComponent,
       ChildComponent,
       CommentsComponent,
       CommentsDetailsComponent,
       DollarPipe,


        //  TwowayBindingComponent
],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      { path : '' , component : HomeComponent},
      { path : 'about' , component : AboutComponent},
      { path : 'help' , component : HelpComponent},
      { path : 'property' , component : PropertyBindingComponent},
      { path : 'eventproperty' , component : EventBindingComponent},
      { path : 'login' , component :  StructuralDirectiveComponent},
      { path : 'ng-for' , component :  NgForComponent},
      { path : 'ng-switch' , component :  NgswitchComponent},
      { path : 'register' , component :  RegisterComponent},
      { path : 'forms' , component : FormsComponent},
      { path : 'Reactiveform' , component : ReactiveformComponent},
      { path : 'parent' , component : ParentComponent},
      { path : 'comment-detail' , component : CommentsDetailsComponent}


    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
