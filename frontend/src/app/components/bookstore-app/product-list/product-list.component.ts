import { Component, OnInit } from '@angular/core';
import { BookService } from './product-list.component.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  booksPage: any;
  bookService: BookService;

  constructor(bookService: BookService) {
    this.bookService = bookService;
   }

  ngOnInit(): void {

    this.booksPage = this.bookService.getBooks().subscribe((data => {
      this.booksPage = data;
      console.log(this.booksPage);
    }))

  }

}
