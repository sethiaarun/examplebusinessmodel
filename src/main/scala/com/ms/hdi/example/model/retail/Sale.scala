package com.ms.hdi.example.model.retail

import com.ms.hdi.example.model.BaseDataGen

/**
 * Sales data
 * @param customerId customer id
 * @param date sale date/tx date
 * @param saleValue sale value
 */
case class Sale(customerId:Int, date:String, saleValue: Float) extends BaseDataGen
