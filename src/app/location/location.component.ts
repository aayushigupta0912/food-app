import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-location',
  templateUrl: './location.component.html',
  styleUrls: ['./location.component.css']
})
export class LocationComponent implements OnInit {

  constructor() { }
    lat: Number = 26.8467;
    lng: Number = 80.9462;
  ngOnInit() {
  }

}
