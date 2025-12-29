package com.example.demo.service.impl;

import com.example.demo.model.Booking;
import com.example.demo.model.BookingLog;
import com.example.demo.repository.BookingLogRepository;
import com.example.demo.repository.BookingRepository;
import com.example.demo.service.BookingLogService;

import java.util.List;

public class BookingLogServiceImpl implements BookingLogService {

    private final BookingLogRepository logRepository;
    private final BookingRepository bookingRepository;

    public BookingLogServiceImpl(BookingLogRepository logRepository,
                                 BookingRepository bookingRepository) {
        this.logRepository = logRepository;
        this.bookingRepository = bookingRepository;
    }

    @Override
    public BookingLog addLog(Long bookingId, String message) {
        Booking booking = bookingRepository.findById(bookingId).orElseThrow();
        return logRepository.save(new BookingLog(null, booking, message, null));
    }

    @Override
    public List<BookingLog> getLogsByBooking(Long bookingId) {
        Booking booking = bookingRepository.findById(bookingId).orElseThrow();
        return logRepository.findByBookingOrderByLoggedAtAsc(booking);
    }
}
