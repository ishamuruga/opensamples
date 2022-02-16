import { TestBed } from '@angular/core/testing';

import { DataPushService } from './data-push.service';

describe('DataPushService', () => {
  let service: DataPushService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DataPushService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
