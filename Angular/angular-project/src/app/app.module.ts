import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { HaederComponent } from './haeder/haeder.component';
import { RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { CarsComponent } from './cars/cars.component';
import { BikesComponent } from './bikes/bikes.component';
import { MoviesComponent } from './movies/movies.component';
import { LaptopComponent } from './laptop/laptop.component';
import { MobileComponent } from './mobile/mobile.component';
import { CarchildComponent } from './carchild/carchild.component';
import { BikechildComponent } from './bikechild/bikechild.component';
import { MoviechildComponent } from './moviechild/moviechild.component';

@NgModule({
  declarations: [
    AppComponent,
    HaederComponent,
    HomeComponent,
    CarsComponent,
    BikesComponent,
    MoviesComponent,
    LaptopComponent,
    MobileComponent,
    CarchildComponent,
    BikechildComponent,
    MoviechildComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path : '', component: HomeComponent},
      {path : 'cars', component: CarsComponent},
      {path : 'bikes', component: BikesComponent},
      {path : 'movies', component: MoviesComponent},
      {path : 'laptops', component: LaptopComponent},
      {path : 'mobiles', component:MobileComponent}





    ])

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
