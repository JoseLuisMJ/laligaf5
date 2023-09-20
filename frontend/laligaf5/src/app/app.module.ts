import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './global/header/header.component';
import { FooterComponent } from './global/footer/footer.component';
import { HomeComponent } from './events/views/home/home.component';
import { StaffComponent } from './events/views/staff/staff.component';
import { CalendarComponent } from './events/views/calendar/calendar.component';
import { CardhomeComponent } from './events/components/cardhome/cardhome.component';
import { CardteamComponent } from './events/components/cardteam/cardteam.component';
import { CarddetailsteamsComponent } from './events/components/carddetailsteams/carddetailsteams.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    HomeComponent,
    StaffComponent,
    CalendarComponent,
    CardteamComponent,
    CarddetailsteamsComponent, 
    CardhomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
