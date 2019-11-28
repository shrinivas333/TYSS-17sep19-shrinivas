import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { CountriesComponent } from './countries/countries.component';
import { CategoriesComponent } from './categories/categories.component';
import { SourcesComponent } from './sources/sources.component';
import { SearchvalueComponent } from './searchvalue/searchvalue.component';
import { IndiaComponent } from './india/india.component';
import { UsaComponent } from './usa/usa.component';
import { RussiaComponent } from './russia/russia.component';
import { BussinessComponent } from './bussiness/bussiness.component';
import { EntertainmentComponent } from './entertainment/entertainment.component';
import { HealthComponent } from './health/health.component';
import { TechnologyComponent } from './technology/technology.component';
import { BBCComponent } from './bbc/bbc.component';
import { TOIComponent } from './toi/toi.component';
import { FoxComponent } from './fox/fox.component';
import { EspnComponent } from './espn/espn.component';
import { HinduComponent } from './hindu/hindu.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    CountriesComponent,
    CategoriesComponent,
    SourcesComponent,
    SearchvalueComponent,
    IndiaComponent,
    UsaComponent,
    RussiaComponent,
    BussinessComponent,
    EntertainmentComponent,
    HealthComponent,
    TechnologyComponent,
    BBCComponent,
    TOIComponent,
    FoxComponent,
    EspnComponent,
    HinduComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule.forRoot([
      { path : '' , component : HomeComponent},
      { path : 'countries' , component : CountriesComponent},
      { path : 'category' , component : CategoriesComponent},
      { path : 'source' , component : SourcesComponent},
      { path : 'searchval' , component : SearchvalueComponent},
      { path : 'india' , component : IndiaComponent},
      { path : 'usa' , component : UsaComponent},
      { path : 'russia' , component : RussiaComponent},
      { path : 'bussiness' , component : BussinessComponent},
      { path : 'entertainment' , component : EntertainmentComponent},
      { path : 'health' , component : HealthComponent},
      { path : 'technology' , component : TechnologyComponent},
      { path : 'bbc' , component : BBCComponent},
      { path : 'toi' , component : TOIComponent},
      { path : 'fox' , component : FoxComponent},
      { path : 'espn' , component : EspnComponent},
      { path : 'hindu' , component : HinduComponent},

    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
