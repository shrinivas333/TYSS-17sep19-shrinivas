import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {

  name = 'jhon';
  imgurl = 'https://cdn.pixabay.com/photo/2019/09/27/14/38/zoo-4508682__340.jpg';
address = 'Marthhalli banglore 560075';
colorname = 'red';
isactive = false;
colspanvalue = 2;


  constructor() { }

  ngOnInit() {
      setInterval(() => {
        this.colorname = 'yellow';
        this.isactive = !this.isactive;

      }, 3000);

  }

}
