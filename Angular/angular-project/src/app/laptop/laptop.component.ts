import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-laptop',
  templateUrl: './laptop.component.html',
  styleUrls: ['./laptop.component.css']
})
export class LaptopComponent implements OnInit {


  slectedlaptop;
  laptops = [
    {
      name : 'Asus',
      imgurl : 'https://cdn.pixabay.com/photo/2014/05/02/21/49/home-office-336373__340.jpg'
    },
  
    {
      name : 'Hp-550',
      imgurl : 'https://cdn.pixabay.com/photo/2014/05/02/21/47/workstation-336369__340.jpg'
    },
  
    {
      name : 'Gaming-laptop',
      imgurl : 'https://cdn.pixabay.com/photo/2016/06/28/05/10/laptop-1483974__340.jpg'
    },
    {
      name : 'Laptop',
      imgurl : 'https://image.shutterstock.com/image-photo/mans-hands-using-laptop-blank-260nw-295381787.jpg'
    }
  ];

  constructor() { }

  ngOnInit() {
  }

}
