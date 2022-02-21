import { ErrorHandler, NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GridComponent } from './components/grid/grid.component';
import { LoginComponent } from './components/login/login.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { AboutComponent } from './components/about/about.component';
import { PageNotFoundComponent } from './components/page-not-found/page-not-found.component';
import { ExpPipe } from './pipes/exp.pipe';
import { DisplayComponent } from './components/display/display.component';
import { Display2Component } from './components/display2/display2.component';
import { GlobalErrorHandlerService } from './services/global-error-handler.service';
import { DashboardModule } from './modules/dashboard/dashboard.module';

@NgModule({
  declarations: [
    AppComponent,
    GridComponent,
    LoginComponent,
    DashboardComponent,
    AboutComponent,
    PageNotFoundComponent,
    ExpPipe,
    DisplayComponent,
    Display2Component
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    DashboardModule
  ],
  providers: [
    { provide : ErrorHandler , useClass:GlobalErrorHandlerService }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
