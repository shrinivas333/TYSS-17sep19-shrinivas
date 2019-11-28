import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {



  slectedmovie;
  movies = [
    {
      name : 'Spider man',
      imgurl : 'https://cdn.pixabay.com/photo/2019/04/08/16/27/spiderman-4112322__340.jpg'
    },
  
    {
      name : 'dead-pool',
      imgurl : 'https://cdn.pixabay.com/photo/2017/08/27/23/59/marvel-2688068__340.jpg'
    },
  
    {
      name : 'Iron Man',
      imgurl :'https://cdn.pixabay.com/photo/2019/05/31/02/08/iron-man-4241268__340.jpg'
    },
    {
      name : 'Avengers',
      imgurl : 'https://cdn.pixabay.com/photo/2019/05/26/01/13/avengers-4229465__340.jpg'
    }
  ];
  constructor() { }

  ngOnInit() {
  }
  sendmovie(movie) {
    this.slectedmovie=movie;
  }

}
