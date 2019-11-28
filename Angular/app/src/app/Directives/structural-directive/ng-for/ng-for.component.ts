import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {

  produts =[{
    imga : "https://cdn.pixabay.com/photo/2017/11/09/18/02/ice-cream-2934210__340.jpg",
    name : "icecream",
    price :23
 },{
  imga : "https://image.shutterstock.com/image-photo/carrot-cake-walnuts-prunes-dried-260nw-240942928.jpg",
  name : "potato",
  price :55
 },{
  imga : "https://image.shutterstock.com/image-photo/chocolate-caramel-cupcake-nuts-butterscotch-260nw-443169010.jpg",
  name : "cake",
  price :60
 }];
  constructor() { }

  ngOnInit() {
  }

}
