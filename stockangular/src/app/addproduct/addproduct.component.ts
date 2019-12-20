import { Component, OnInit } from '@angular/core';
import { AuthserviceService } from '../authservice.service';

@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent implements OnInit {
message;
  constructor(private auth: AuthserviceService) { }

  addproducts(form) {
    console.log(form.value);
    this.auth.addproducts(form.value).subscribe(data => {
      console.log(data);
      this.message = data.message;
    }, err => {
      console.log(err);
    });
  }
  ngOnInit() {
  }
}
