import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import Card from './Card';
import { FoodService } from './food.service';
import { NgFor } from '@angular/common';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,NgFor],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit {

  cards?:Card[];

  constructor(private foodService:FoodService){}

  ngOnInit(): void {
    this.foodService.fetchAll().subscribe(res=>{
      this.cards = res as Card[];
    })
  }

  save(){
    let card = {
      card:Math.round(Math.random()*1000)+"",
      dob:new Date()
    }
    this.foodService.save(card);
  }

  title = 'food-card-app';
}
