import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cars',
  templateUrl: './cars.component.html',
  styleUrls: ['./cars.component.css']
})
export class CarsComponent implements OnInit {

  selctedcar;
cars = [
  {
    name : 'lamberghini',
    imgurl : 'https://cdn.pixabay.com/photo/2012/05/29/00/43/car-49278__340.jpg'
  },

  {
    name : 'BMW',
    imgurl : 'https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408__340.jpg'
  },

  {
    name : 'Audi',
    imgurl : 'https://cdn.pixabay.com/photo/2015/01/19/13/51/car-604019__340.jpg'
  },
  {
    name : 'Benz',
    imgurl : 'https://cdn.pixabay.com/photo/2016/12/03/18/57/amg-1880381__340.jpg'
  }
];


  constructor() { }

  ngOnInit() {
  }
  sendcar(car) {
    this.selctedcar = car;
  }
}
