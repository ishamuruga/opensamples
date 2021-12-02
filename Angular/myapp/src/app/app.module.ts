import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GridComponent } from './components/grid/grid.component';
import { CommonService } from './services/common.service';
import { CustomerDashBoardModule } from './modules/customer-dash-board/customer-dash-board.module';
import { ExpPipe } from './components/pipes/exp.pipe';
import { NotificationComponent } from './notification/notification.component';

@NgModule({
  declarations: [
    AppComponent,
    GridComponent,
    ExpPipe,
    NotificationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    CustomerDashBoardModule
  ],
  providers: [CommonService],
  bootstrap: [AppComponent]
})
export class AppModule { }
