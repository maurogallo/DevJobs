import { Component, OnInit } from '@angular/core';

import { Recipe } from '../recipe.model'
@Component({
  selector: 'app-recipe-list',
  templateUrl: './recipe-list.component.html',
  styleUrls: ['./recipe-list.component.css']
})
export class RecipeListComponent implements OnInit {
recipes: Recipe[] = [
  new Recipe('A Test Recipe', 'This is simply a test','https://res.cloudinary.com/hellofresh/image/upload/f_auto,fl_lossy,q_auto,w_610/v1/hellofresh_s3/image/mediterranean-hummus-couscous-bowls-9aa1b9c2.jpg'),
  new Recipe('A Test Recipe', 'This is simply a test','https://res.cloudinary.com/hellofresh/image/upload/f_auto,fl_lossy,q_auto,w_610/v1/hellofresh_s3/image/mediterranean-hummus-couscous-bowls-9aa1b9c2.jpg')
];


  constructor() { }

  ngOnInit() {
  }

}
