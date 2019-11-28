import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bikes',
  templateUrl: './bikes.component.html',
  styleUrls: ['./bikes.component.css']
})
export class BikesComponent implements OnInit {

slectedbike;
  bikes = [
    {
      name : 'BMV',
      imgurl : 'https://cdn.pixabay.com/photo/2016/04/07/06/53/bmw-1313343__340.jpg'
    },
  
    {
      name : 'Suzaki',
      imgurl : 'https://cdn.pixabay.com/photo/2014/12/16/03/37/motor-cycle-569865__340.jpg'
    },
  
    {
      name : 'RE Interceptor',
      imgurl : 'https://cdn.pixabay.com/photo/2016/03/27/17/59/vintage-1283299__340.jpg'
    },
    {
      name : 'Royal Enfield',
      imgurl : 'https://cdn.pixabay.com/photo/2015/08/27/09/06/bike-909690__340.jpg'
    }
  ];
  constructor() { }

  ngOnInit() {
  }
  sendbike(bike) {
    this.slectedbike=bike;
    console.log(bike);
  }
}
