import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-community',
  templateUrl: './community.component.html',
  styleUrls: ['./community.component.css']
})
export class CommunityComponent implements OnInit {

  constructor() { }

  ngOnInit() {
    const parallax1 = document.getElementById('parallax1');
    window.addEventListener('scroll' , function() {
      let offset = this.window.pageYOffset;
      parallax1.style.backgroundPositionY = offset * 0.5 + "px";
    });
    const parallax2 = document.getElementById('parallax2');
    window.addEventListener('scroll' , function() {
      let offset = this.window.pageYOffset;
      parallax2.style.backgroundPositionY = offset * 1.0 + "px";
    });
    const parallax3 = document.getElementById('parallax3');
    window.addEventListener('scroll' , function() {
      let offset = this.window.pageYOffset;
      parallax3.style.backgroundPositionY = offset * 0.5 + "px";
    });
    const parallax4 = document.getElementById('parallax4');
    window.addEventListener('scroll' , function() {
      let offset = this.window.pageYOffset;
      parallax4.style.backgroundPositionY = offset * 2.0 + "px";
    });
  }

}
