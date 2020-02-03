import { Component, OnInit, Inject, HostListener } from '@angular/core';
import { trigger, state, transition, style, animate } from '@angular/animations';  
import { DOCUMENT } from '@angular/common';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css'],
})
export class DashboardComponent implements OnInit {

  constructor() { }

  ngOnInit() {

    const parallax = document.getElementById('parallax');
    const navbar = document.getElementById('navbar');
    window.addEventListener('scroll' , function() {
      let offset = this.window.pageYOffset;
      parallax.style.backgroundPositionY = offset * 0.7 + 'px';
    });

  }
  }


