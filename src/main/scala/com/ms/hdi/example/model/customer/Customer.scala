package com.ms.hdi.example.model.customer

import com.ms.hdi.example.model.BaseDataGen

/**
 * Example Customer Model
 *
 * @param customerId
 * @param customerName
 * @param firstName
 * @param lastName
 * @param userName
 * @param state
 */
case class Customer(customerId: Int, customerName: String, firstName: String,
                    lastName: String, userName: String, email: String, state: String) extends BaseDataGen
